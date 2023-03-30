package login.loginspring.domain;

import javax.persistence.*;

@Entity(name = "goals")
public class Goals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //@Column(name = "USER_ID")
    private String userId;

    private Integer orderNum;
    private String category;

    public Integer getId() {return id;}

    public String getUserId() {return userId;}

    public Integer getOrderNum() {return orderNum;}

    public String getCategory() {return category;}

    public void setId(Integer id) {this.id = id;}

    public void setUserId(String userId) {this.userId = userId;}

    public void setOrderNum(Integer orderNum) {this.orderNum = orderNum;}

    public void setCategory(String category) {this.category = category;}
}
