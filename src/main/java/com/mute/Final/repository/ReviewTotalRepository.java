package com.mute.Final.repository;
import com.mute.Final.entity.Member;
import com.mute.Final.entity.Musical;
import com.mute.Final.entity.ReviewTotal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface ReviewTotalRepository extends JpaRepository<ReviewTotal, Long> {
    // 뮤지컬 별점 높은순 top3 => 수정예정
    // 필요한 쿼리 => select musical_id, avg(score_avg_musical) from review_musical group by musical_id order by avg(score_avg_musical) desc limit 3;
    @Query(value = "select * from review_musical limit 3", nativeQuery = true)
    List<ReviewTotal> findTopStar();
    List<ReviewTotal> findByMusicalId(Musical musicalId); // 뮤지컬 총평 후기 view
    Long deleteByReviewMuId(long reviewMuId); // 뮤지컬 총평 후기 삭제
    ReviewTotal findByReviewMuId(long reviewMuId);

}
