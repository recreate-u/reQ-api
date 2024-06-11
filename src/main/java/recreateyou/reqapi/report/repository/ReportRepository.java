package recreateyou.reqapi.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import recreateyou.reqapi.report.entity.ReportEntity;
import recreateyou.reqapi.user.entity.UserEntity;

@Repository
public interface ReportRepository extends JpaRepository<ReportEntity, Long> {

    @Query(value = "SELECT COUNT(re) FROM ReportEntity re WHERE re.feedSeq = :feedSeq", nativeQuery = false)
    long countByFeedSeq(@Param("feedSeq") Long feedSeq);
}
