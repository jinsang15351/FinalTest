package ci.jvision.admin201718046.web;

import ci.jvision.admin201718046.service.ProductsService;
import ci.jvision.admin201718046.web.dto.ProductsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ProductsApiController {

    private final ProductsService productsService;

    @PostMapping("/api/v1/products")
    public Long save(@RequestBody ProductsSaveRequestDto requestDto)
    {
        return productsService.save(requestDto);
    }
}