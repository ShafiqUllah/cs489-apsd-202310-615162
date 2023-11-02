package cs489.srmwebapi;

import cs489.srmwebapi.model.Product;
import cs489.srmwebapi.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = {"/srmweb/api/product"})
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PutMapping(value = {"/update/{productNo}"})
    public ResponseEntity<Product> updateProduct(@PathVariable Long productNo, @RequestBody Product product) {
        return new ResponseEntity<>(productService.updateProductByProductNo(productNo, product),
                HttpStatus.OK);
    }
}
