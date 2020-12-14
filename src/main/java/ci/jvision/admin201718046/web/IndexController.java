package ci.jvision.admin201718046.web;

import ci.jvision.admin201718046.domain.products.Products;
import ci.jvision.admin201718046.service.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final ProductsService productsService;

    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("products", productsService.findAllDesc());
        return "index";
    }

    @GetMapping("/products/save")
    public String productsSave()
    {
        return "products-save";
    }
}