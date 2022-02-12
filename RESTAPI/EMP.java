package astu.edu.restemp;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EMP {
  private Long id;
  private String name;
    public EMP () {}
    public EMP(Long id, String name) {
        this.id = id;
        this.name = name;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
