
package br.com.projetoBase.modelo;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import java.util.Date;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class User extends EntidadeAbstrata {

    @NotNull
    private String user_name;
    private int matricula;
    @NotNull
    private String senha;
    @NotNull
    private UserType usertype;
  
    //gets e sets

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public UserType getUsertype() {
        return usertype;
    }

    public void setUsertype(UserType usertype) {
        this.usertype = usertype;
    }

}
//*/
