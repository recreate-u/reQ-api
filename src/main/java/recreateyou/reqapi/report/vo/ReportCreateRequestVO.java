package recreateyou.reqapi.report.vo;

import lombok.NonNull;

public record ReportCreateRequestVO(
        @NonNull Long reportSeq,

        @NonNull String context

){

}
