package recreateyou.reqapi.report.vo;

import lombok.NonNull;
import recreateyou.reqapi.feed.entity.FeedEntity;

import java.util.List;

public record ReportRequestVO (
        @NonNull Long reportSeq,

        @NonNull String context

){

}
