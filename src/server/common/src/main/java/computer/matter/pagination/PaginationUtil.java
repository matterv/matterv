package computer.matter.pagination;

import java.util.List;

public class PaginationUtil {
  public static <T> List<T> getPage(List<T> sourceList, int page, int pageSize) {
    if (pageSize <= 0 || page <= 0) {
      throw new IllegalArgumentException("Invalid page size: " + pageSize);
    }

    int fromIndex = (page - 1) * pageSize;
    if (sourceList == null || sourceList.size() <= fromIndex) {
      return List.of(); // Return empty list if page is out of range
    }

    // toIndex is exclusive, so we need to check if it's greater than the list size
    int toIndex = Math.min(fromIndex + pageSize, sourceList.size());
    return sourceList.subList(fromIndex, toIndex);
  }
}
