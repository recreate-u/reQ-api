package recreateyou.reqapi.feed.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import recreateyou.reqapi.feed.entity.FeedEntity;
import recreateyou.reqapi.feed.respository.FeedRepository;
import recreateyou.reqapi.feed.vo.FeedCreateVO;
import recreateyou.reqapi.feed.vo.FeedUpdateVO;
import recreateyou.reqapi.feed.vo.FeedVO;

import java.util.Optional;

@Transactional
@Service
@RequiredArgsConstructor
public class FeedService {

    private final FeedRepository feedRepository;


    public void registerFeed(FeedCreateVO feedVO){
        feedRepository.save(feedVO.toEntity());
    }

    public FeedVO getFeed(Long feedIdx){
        Optional<FeedEntity> feedLists = feedRepository.findById(feedIdx);
        FeedEntity feedVO = feedLists.orElseThrow(()-> new RuntimeException("피드가 없습니다."));
        return new FeedEntity().toResponseVO();
    }
    public void putFeed(Long feedIdx, FeedUpdateVO feedVO){
        FeedEntity feedEntity = feedRepository.findById(feedIdx)
                        .orElseThrow(()-> new RuntimeException("피드없음"));
        feedRepository.save(feedVO.toEntity(feedIdx,feedEntity.getUserId()));
    }

    public void deleteNotice(Long feedIdx){
        feedRepository.deleteById(feedIdx);
    }

}
