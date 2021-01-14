
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ConsultasPersona extends Conexion{
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean insertar(Persona persona){
        Connection conexion = getConnection();
        try{
            ps = conexion.prepareStatement("insert into persona (clave,nombre,domicilio,celular,correo_electronico,fecha_nacimiento,genero) values(?,?,?,?,?,?,?)");
            ps.setString(1, persona.getClave());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getDomicilio());
            ps.setString(4, persona.getCelular());
            ps.setString(5,persona.getCorreo_electronico());
            ps.setDate(6, persona.getFecha_nacimiento());
            ps.setString(7, persona.getGenero());
            int resultado = ps.executeUpdate();
            
            if(resultado>0){
                return true;
            }
            else{
                return false;
            }
            
            
        }catch(Exception e){
            System.err.println("Error: " + e);
            return false;
        }finally{
            try{
                conexion.close();
            }catch(Exception e){
                System.err.println("Error al cerrar:" + e);
            }
        }
        
    }
    public boolean buscar(Persona persona){
        Connection conexion = getConnection();
        try{
            ps = conexion.prepareStatement("select * from persona where clave=?");
            ps.setString(1, persona.getClave());
            rs = ps.executeQuery();
            
            //SI RS.NEXT ES TRUE
            if(rs.next()){
                //hemos encontrado la persona
                persona.setIdPersona(rs.getInt("idPersona"));
                persona.setClave(rs.getString("clave"));
                persona.setNombre(rs.getString("nombre"));
                persona.setDomicilio(rs.getString("domicilio"));
                persona.setCelular(rs.getString("celular"));
                persona.setCorreo_electronico(rs.getString("correo_electronico"));
                persona.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                persona.setGenero(rs.getString("genero"));
                return true;
                
                
            }else{
                return false;
            }   
        }catch(Exception e){
            System.err.println("Error: " + e);
            return false;
        }finally{
            try{
                conexion.close();
            }catch(Exception e){
                System.err.println("Error al cerrar:" + e);
            }
        }
        
    }
    
    public boolean modificar(Persona persona){
        Connection conexion = getConnection();
        try{
            ps = conexion.prepareStatement("update persona set clave=?,nombre=?,domicilio=?,celular=?,correo_electronico=?,fecha_nacimiento=? where idPersona=?");
            ps.setString(1, persona.getClave());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getDomicilio());
            ps.setString(4, persona.getCelular());
            ps.setString(5,persona.getCorreo_electronico());
            ps.setDate(6, persona.getFecha_nacimiento());
            
            ps.setInt(7, persona.getIdPersona());
            int resultado = ps.executeUpdate();
            
            if(resultado>0){
                return true;
            }
            else{
                return false;
            }
            
            
        }catch(Exception e){
            System.err.println("Error: " + e);
            return false;
        }finally{
            try{
                conexion.close();
            }catch(Exception e){
                System.err.println("Error al cerrar:" + e);
            }
        }
        
    }
    
    public boolean eliminar(Persona persona){
        Connection conexion = getConnection();
        try{
            ps = conexion.prepareStatement("delete from persona where idPersona=?");
            ps.setInt(1, persona.getIdPersona());
            
            int resultado = ps.executeUpdate();
            
            if(resultado>0){
                return true;
            }
            else{
                return false;
            }
            
            
        }catch(Exception e){
            System.err.println("Error: " + e);
            return false;
        }finally{
            try{
                conexion.close();
            }catch(Exception e){
                System.err.println("Error al cerrar:" + e);
            }
        }
        
    }
    
}
