package recreateyou.reqapi.notice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import recreateyou.reqapi.notice.entity.NoticeEntity;
import recreateyou.reqapi.notice.repository.NoticeRepository;
import recreateyou.reqapi.notice.vo.NoticeCreateRequestVO;
import recreateyou.reqapi.notice.vo.NoticeResponseVO;
import recreateyou.reqapi.notice.vo.NoticeUpdateRequestVO;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Transactional
@Service
@RequiredArgsConstructor
public class NoticeService {

    private final NoticeRepository noticeRepository;

    public void registerNotice(NoticeCreateRequestVO noticeCreateRequestVO){
        noticeRepository.save(noticeCreateRequestVO.toEntity());
    }

    public NoticeResponseVO getNotice(@PathVariable("notice-seq") Long noticeSeq){
        Optional<NoticeEntity> findNotice = noticeRepository.findById(noticeSeq);
        NoticeEntity noticeEntity = findNotice.orElseThrow(() -> new RuntimeException("공지사항 없음"));
        return noticeEntity.toResponseVO();
    }

    public List<NoticeResponseVO> getAllNotice(){
        return noticeRepository.findAll().stream()
                .map(entity -> new NoticeResponseVO(
                        entity.getNoticeSeq(),
                        entity.getUserId(),
                        entity.getTitle(),
                        entity.getContext(),
                        entity.getRegDate(),
                        entity.getUpdDate()
                ))
                .collect(Collectors.toList());
    }

    public void putNotice(Long noticeSeq, NoticeUpdateRequestVO noticeUpdateRequestVO){
        NoticeEntity noticeEntity = noticeRepository.findById(noticeSeq)
                .orElseThrow(() -> new RuntimeException("공지사항 없음"));
        noticeRepository.save(noticeUpdateRequestVO.toEntity(noticeEntity.getNoticeSeq(), noticeEntity.getUserId()));
    }

    public void deleteNotice(@PathVariable("notice-seq") Long noticeSeq){
        noticeRepository.deleteById(noticeSeq);
    }
}
