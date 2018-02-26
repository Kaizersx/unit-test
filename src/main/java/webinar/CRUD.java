package webinar;

import java.util.HashMap;

public class CRUD {


    HashMap<Integer,Entity>base= new HashMap<Integer, Entity>();


    public boolean create (Entity entity){

        if(base.containsKey(entity.getId())){

            return false;}

        base.put(entity.getId(),entity);
        return true;
    }

    public Entity read(int id){

        return base.get(id);
    }


    public boolean update(Entity entity){

        if (!base.containsKey(entity.getId())){

            return false;
        }
        base.put(entity.getId(),entity);
        return true;

    }

    public boolean delete (Entity entity){

        return false;

    }
}
