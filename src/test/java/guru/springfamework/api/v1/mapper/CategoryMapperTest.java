package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.CategoryDTO;
import guru.springfamework.domain.Category;
import junit.framework.TestCase;
import org.junit.Test;

public class CategoryMapperTest extends TestCase {

    public static final String JOE = "joe";
    public static final long ID = 1L;
    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testCategoryToCategoryDTO() throws Exception{

        Category category = new Category();
        category.setName(JOE);
        category.setId(ID);

        CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);

        assertEquals(JOE, categoryDTO.getName());
        assertEquals(Long.valueOf(ID), categoryDTO.getId());

    }
}