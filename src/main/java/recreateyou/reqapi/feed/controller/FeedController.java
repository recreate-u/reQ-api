package recreateyou.reqapi.feed.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import recreateyou.reqapi.feed.service.FeedService;
import recreateyou.reqapi.feed.vo.FeedVO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/feed")
public class FeedController {

    private final FeedService feedService;

    @GetMapping("/{feed-idx}")
    public void registerFeed(@PathVariable("feed_idx") Long feedIdx, @RequestBody FeedVO feedVO) {
        feedService.registerFeed(feedIdx, feedVO);
    }

    @PostMapping("/{feed_idx}")
    public FeedVO registerFeed(@PathVariable("feed_idx") Long feedIdx) {
        return feedService.getFeed(feedIdx);
    }

    @PatchMapping("/{feed_idx}")
    public void patchNotice(@PathVariable("feed_idx") Long feedIdx, @RequestBody FeedVO feedVO){
        feedService.patchNotice(feedIdx,  feedVO);
    }


    @DeleteMapping("/{feed_idx}")
    public void deleteNotice(@PathVariable("feed_idx") Long feedIdx){
        feedService.deleteNotice(feedIdx);
    }

}