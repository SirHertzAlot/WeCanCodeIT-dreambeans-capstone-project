import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    InventoryRepository Repository;

    @GetMapping("/allproducts")
    public List<Products> getAllProducts() {
        return Repository.findAll();
    }

    @getMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Optional<Product> product = Repository.findById(id);
        if (product.isPresent()) {
            return ResponseEntity.ok(product.get());
        } else {
            return ResponseEntity.notFound();
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product savedProduct = Repository.save(product);
        return ResponseEntity.status(HttpStatusCode.Created).body(savedProduct);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
        Optional<Product> existingProduct = Repository.findById(id);
        if(existingProduct.isPresent()) {
            Product product = existingProduct.get();
            product.setName(updatedProduct.getName());
            product.setDescription(updatedProduct.getDescription());
            product.setPrice(updatedProduct.getPrice());
            Product savedProduct = Repository.save(product);
            return ResponseEntity.ok(savedProduct);
            }else {
            return ResponseEntity.notFound();
            }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        Optional<Product> existingProduct = Repository.findById(id);
        if (existingProduct.isPresent()) {
            Repository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
    }
}
