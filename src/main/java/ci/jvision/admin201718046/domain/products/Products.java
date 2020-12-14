package ci.jvision.admin201718046.domain.products;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Products {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition="TEXT", nullable = false)
    private String p_id;

    private String p_name;

    private String p_price;

    @Column(length=500, nullable = false)
    private String p_desc;


    @Builder
    public Products(String p_id, String p_name, String p_price, String p_desc)
    {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_price = p_price;
        this.p_desc = p_desc;
    }
}
