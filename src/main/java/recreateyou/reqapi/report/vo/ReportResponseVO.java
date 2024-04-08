package recreateyou.reqapi.report.vo;

import lombok.NonNull;

public record ReportResponseVO(
        Long reportSeq,

        String context,

        Long feedSeq,

        String reportReason
) {
}
