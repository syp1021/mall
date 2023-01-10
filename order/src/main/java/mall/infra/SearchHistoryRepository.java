package mall.infra;

import mall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="searchHistories", path="searchHistories")
public interface SearchHistoryRepository extends PagingAndSortingRepository<SearchHistory, Long> {

    

    
}
