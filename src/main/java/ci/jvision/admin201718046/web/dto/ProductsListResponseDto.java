package ci.jvision.admin201718046.web.dto;

import ci.jvision.admin201718046.domain.products.Products;
import lombok.Getter;

@Getter
public class ProductsListResponseDto {
    private Long id;
    private String p_id;
    private String p_name;
    private String p_price;
    private String p_desc;

    public ProductsListResponseDto(Products entity)
    {
        this.id = entity.getId();
        this.p_id = entity.getP_id();
        this.p_name = entity.getP_name();
        this.p_price = entity.getP_price();
        this.p_desc = entity.getP_desc();
    }
}
