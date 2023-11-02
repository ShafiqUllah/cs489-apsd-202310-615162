package cs489.srmwebapi.service;

import cs489.srmwebapi.model.Product;
import cs489.srmwebapi.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product updateProductByProductNo(Long productNo, Product editedProduct) {
        var product = productRepository.findProductByProductNo(productNo)
                .orElseThrow(() -> new IllegalArgumentException("Invalid ProducNo"));
        product.setName(editedProduct.getName());
        product.setUnitPrice(editedProduct.getUnitPrice());
        product.setQuantityInStock(editedProduct.getQuantityInStock());
        product.setDateSupplied(editedProduct.getDateSupplied());
        return productRepository.save(product);
    }
}
