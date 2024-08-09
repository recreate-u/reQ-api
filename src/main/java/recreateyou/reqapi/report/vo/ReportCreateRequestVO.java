package recreateyou.reqapi.report.vo;

import lombok.NonNull;
import recreateyou.reqapi.report.entity.ReportEntity;

public record ReportCreateRequestVO(
        @NonNull String context

){
    public ReportEntity toEntity() {
        return ReportEntity.builder()
                .context(this.context)
                .build();
    }
}
