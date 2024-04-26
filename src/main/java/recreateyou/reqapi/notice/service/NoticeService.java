package recreateyou.reqapi.notice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import recreateyou.reqapi.notice.entity.NoticeEntity;
import recreateyou.reqapi.notice.repository.NoticeRepository;
import recreateyou.reqapi.notice.vo.NoticeRequestVO;
import recreateyou.reqapi.notice.vo.NoticeResponseVO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
@RequiredArgsConstructor
public class NoticeService {

    private final NoticeRepository noticeRepository;

    public void registerNotice(Long noticeSeq, NoticeRequestVO noticeRequestVO){
        noticeRepository.save(new NoticeEntity(noticeSeq, noticeRequestVO));
    }

    public NoticeResponseVO getNotice(@PathVariable("notice-seq") Long noticeSeq){
        Optional<NoticeEntity> findNotice = noticeRepository.findById(noticeSeq);
        NoticeEntity noticeEntity = findNotice.orElseThrow(() -> new RuntimeException("공지사항 없음"));
        return new NoticeEntity().toResponseVO();
    }

    public List<NoticeResponseVO> getAllNotice(){
        List<NoticeEntity> noticeEntities = noticeRepository.findAll();
        List<NoticeResponseVO> vos = new ArrayList<>();
        for(NoticeEntity entity : noticeEntities){
            vos.add(new NoticeResponseVO(entity.getNoticeSeq(), entity.getUserId(), entity.getTitle(), entity.getContext(), entity.getRegDate(), entity.getUpdDate()));
        }
        return vos;
    }

    public void patchNotice(@PathVariable("notice-seq") Long noticeSeq, NoticeRequestVO noticeRequestVO){
        noticeRepository.save(new NoticeEntity(noticeSeq, noticeRequestVO));
    }

    public void deleteNotice(@PathVariable("notice-seq") Long noticeSeq){
        noticeRepository.deleteById(noticeSeq);
    }
}
