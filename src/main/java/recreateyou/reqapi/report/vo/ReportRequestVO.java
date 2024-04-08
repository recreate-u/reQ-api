package recreateyou.reqapi.report.vo;

import lombok.NonNull;

public record ReportRequestVO (
    @NonNull Long reportSeq,

    @NonNull String context,

    @NonNull Long feedSeq,

    @NonNull String reportReason
){

}
