package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.CategoryDTO;
import guru.springfamework.domain.Category;
import junit.framework.TestCase;
import org.junit.Test;

public class CategoryMapperTest extends TestCase {

    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testCategoryToCategoryDTO() throws Exception{

        Category category = new Category();
        category.setName("joe");
        category.setId(1L);

        CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);

        assertEquals("joe", categoryDTO.getName());
        assertEquals(Long.valueOf(1L), categoryDTO.getId());

    }
}