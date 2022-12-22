package com.mute.Final.repository;
import com.mute.Final.entity.Member;
import com.mute.Final.entity.Musical;
import com.mute.Final.entity.ReviewTotal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

public interface ReviewTotalRepository extends JpaRepository<ReviewTotal, Long> {
    @Query(value = "select rm.musical_id as musical_id, m.musical_name as musical_name, m.musical_start as musical_start, " +
            "m.musical_end as musical_end, m.theater_name as theater_name, avg(rm.score_avg_total) as avgMusical " +
            "from review_musical as rm " +
            "join musical as m " +
            "on rm.musical_id = m.musical_id " +
            "group by m.musical_id " +
            "order by avg(rm.score_avg_total) desc limit 3", nativeQuery = true)
    List<Map<?, ?>> reviewTop3();

    List<ReviewTotal> findByMusicalId(Musical musicalId); // 도연 - 뮤지컬 총평 후기 view
    Long deleteByReviewMuId(long reviewMuId); // 도연 - 뮤지컬 총평 후기 삭제
    ReviewTotal findByReviewMuId(long reviewMuId); // 도연 - 뮤지컬 총평 후기 삭제
}
