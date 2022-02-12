package astu.edu.restemp;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriInfo;
import java.util.ArrayList;
@ApplicationPath("/api")
@Path("main")
public class REST extends Application {
    EMPDAO empdao =new EMPDAO();
    Database database = new Database();

    @Context
    private UriInfo context;

    public REST() {

    }
    @Path("emp")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<EMP> get11EMPs() {
        return empdao.getEMPs();
    }
    @Path("ce")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)

    public EMP createEMP(EMP e){
//        String i = null;
//        try
//        {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
//
//            PreparedStatement stmt=con.prepareStatement("insert into stud values(?,?,?,?)");
//            stmt.setString(1,"working");//1 specifies the first parameter in the query
//            stmt.setString(2,"2000");
//            stmt.setString(3,"M");
//            stmt.setString(4,"Marketing");
//           int j=stmt.executeUpdate();
//            System.out.println(j+" records inserted");
//
//            con.close();
//
//        }
//        catch(Exception exe)
//        {
//          i =  exe.getMessage();
//        }
        return  empdao.createEMP(e);
    }
    @Path("ue")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)

    public EMP updateEMP(EMP e){
        return empdao.updateEMP(e);
    }
@Path("/empl/{id}")
@DELETE
@Produces(MediaType.TEXT_PLAIN)
    public Long DeleteEMP(@PathParam("id")String i){
        Long iid = Long.parseLong(i);
        return empdao.deleteEMP(iid);

}


}
