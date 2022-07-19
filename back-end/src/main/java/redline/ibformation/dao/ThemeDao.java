package redline.ibformation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import redline.ibformation.entity.Theme;
@Repository
public interface ThemeDao extends JpaRepository<Theme, Long> {
}
