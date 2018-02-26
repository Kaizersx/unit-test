package webinar;

import org.junit.Assert;
import org.junit.Test;

public class CRUDtest extends Assert {

    @Test
    public void testCRUD (){
       CRUD crud= new CRUD();
       Entity entity= new Entity();
       entity.setId(1);
       assertTrue(crud.create(entity));
       assertNotNull(crud.read(2));
       assertTrue(crud.update(entity));

    }

}
