package redline.ibformation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import redline.ibformation.entity.SousTheme;
@Repository
public interface SousThemeDao extends JpaRepository<SousTheme, Long> {
}
