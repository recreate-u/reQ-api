package recreateyou.reqapi.feed.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import recreateyou.reqapi.feed.entity.FeedEntity;
import recreateyou.reqapi.feed.respository.FeedRepository;
import recreateyou.reqapi.feed.vo.FeedVO;

import java.util.Optional;

@Transactional
@Service
@RequiredArgsConstructor
public class FeedService {

    private final FeedRepository feedRepository;


    public void registerFeed(Long feedIdx, FeedVO feedVO){
        feedRepository.save(new FeedEntity(feedIdx,feedVO));
    }

    public FeedVO getFeed(Long feedIdx){
        Optional<FeedEntity> feedLists = feedRepository.findById(feedIdx);
        FeedEntity feedVO = feedLists.orElseThrow(()-> new RuntimeException("피드가 없습니다."));
        return new FeedEntity().toResponseVO();
    }
    public void patchNotice(Long feedIdx, FeedVO feedVO){
        feedRepository.save(new FeedEntity(feedIdx,feedVO));
    }

    public void deleteNotice(Long feedIdx){
        feedRepository.deleteById(feedIdx);
    }

}
