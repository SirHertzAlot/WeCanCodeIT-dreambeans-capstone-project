/*package com.dreambeans.coffee;


import com.dreambeans.coffee.models.Product;
import com.dreambeans.coffee.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dreambeans.coffee.models.Orders;
import com.dreambeans.coffee.models.Product;
import com.dreambeans.coffee.repositories.OrdersRepository;
import com.dreambeans.coffee.repositories.ProductRepository;
import com.dreambeans.coffee.service.ProductService;

import jakarta.annotation.Resource;


@Component
public class DatabaseLoader implements CommandLineRunner {
    private ProductService productService;
    @Resource
    private ProductRepository productRepo;
    public DatabaseLoader(ProductService productService, ProductRepository productRepo) {
        this.productService = productService;
        this.productRepo = productRepo;
    }

    @Override
    public void run(String... args)throws Exception {
        Product Latte = new Product(6, "Espresso with steamed milk and a small amount of foam.", "Latte", "src/main/resources/assets/coffee_shop_images/latte1.avif");
        productService.saveProduct(Latte);
        productRepo.save(Latte);

        Product Americano = new Product(4.50,"Espresso diluted with hot water","Americano", "src/main/resources/assets/coffee_shop_images/Americano1.jpeg");
        productService.saveProduct(Americano);
        productRepo.save(Americano);

        Product Cappuccino = new Product ( 5, "Espresso, steamed milk, and foam.","Cappuccino", "src/main/resources/assets/coffee_shop_images/cappuccino1.avif" );
        productService.saveProduct(Cappuccino);
        productRepo.save(Cappuccino);

        Product Espresso = new Product ( 4, "A shot of pure, intense coffee.","Espresso", "src/main/resources/assets/coffee_shop_images/espresso1.avif");
        productService.saveProduct(Espresso);
        productRepo.save(Espresso);

        Product Iced_Coffee = new Product ( 4, "Chilled coffee served over ice.","Iced Coffee", "src/main/resources/assets/coffee_shop_images/icedcoffee.avif");
        productService.saveProduct(Iced_Coffee);
        productRepo.save(Iced_Coffee);

        Product Macchiato = new Product ( 5, "  Espresso \"stained\" with a dollop of frothy milk.","Macchiato", "src/main/resources/assets/coffee_shop_images/machiato.avif");
        productService.saveProduct(Macchiato);
        productRepo.save(Macchiato);

        Product Mocha = new Product ( 6, " Espresso with steamed milk, chocolate, and whipped cream.","Mocha", "src/main/resources/assets/coffee_shop_images/mocha.avif");
        productService.saveProduct(Mocha);
        productRepo.save(Mocha);

        Product Cold_Brew = new Product (3.50, "Smooth and strong coffee brewed cold, served over ice.","Cold Brew", "src/main/resources/assets/coffee_shop_images/coldbrew.avif");
        productService.saveProduct(Cold_Brew);
        productRepo.save(Cold_Brew);

        Product Iced_Mocha = new Product ( 6, "Espresso, chocolate, milk, and ice.","Iced Mocha", "src/main/resources/assets/coffee_shop_images/icedmocha.jpeg");
        productService.saveProduct(Iced_Mocha);
        productRepo.save(Iced_Mocha);

        Product Iced_Latte = new Product ( 5, "Espresso, cold milk, and ice.","Iced Latte", "src/main/resources/assets/coffee_shop_images/icedlatte.avif");
        productService.saveProduct(Iced_Latte);
        productRepo.save(Iced_Latte);

        Product Iced_Americano = new Product ( 4.50, "Espresso with cold water over ice.","Iced Americano", "src/main/resources/assets/coffee_shop_images/icedamericano.jpeg");
        productService.saveProduct(Iced_Americano);
        productRepo.save(Iced_Americano);

        Product Black_Tea = new Product ( 3.50, "Hot Tea","Black Tea", "src/main/resources/assets/coffee_shop_images/black tea.jpeg");
        productService.saveProduct(Black_Tea);
        productRepo.save(Black_Tea);

        Product Green_Tea = new Product ( 3.50, "Hot Tea","Green Tea", "src/main/resources/assets/coffee_shop_images/greentea.jpeg");
        productService.saveProduct(Green_Tea);
        productRepo.save(Green_Tea);

        Product Chai_Tea = new Product ( 3.50, "Hot Tea","Chai Tea", "src/main/resources/assets/coffee_shop_images/chaitea.jpeg");
        productService.saveProduct(Chai_Tea);
        productRepo.save(Chai_Tea);

        Product Chamomile_Tea = new Product ( 3.50, "Hot Tea","Chamomile Tea", "src/main/resources/assets/coffee_shop_images/chamomiletea.jpeg");
        productService.saveProduct(Chamomile_Tea);
        productRepo.save(Chamomile_Tea);

        Product Muffin= new Product ( 3, "Blueberry,chocolate chip and banana","Muffin", "src/main/resources/assets/coffee_shop_images/muffins.avif");
        productService.saveProduct(Muffin);
        productRepo.save(Muffin);

        Product Scone = new Product ( 3, "Seasonal Variety ","Scone", "src/main/resources/assets/coffee_shop_images/scone.jpeg");
        productService.saveProduct(Scone);
        productRepo.save(Scone);

        Product Cookie = new Product ( 2, "Chocolate chip and outmeal","Cookie", "src/main/resources/assets/coffee_shop_images/cookie.avif");
        productService.saveProduct(Cookie);
        productRepo.save(Cookie);

        Product Whipped_Cream = new Product ( 1, null,"Whipped Cream", null);
        productService.saveProduct(Whipped_Cream);
        productRepo.save(Whipped_Cream);

        Product Extra_Shot_Espresso = new Product ( 2.99, "Espresso Shot","Extra Shot Of Espresso", null);
        productService.saveProduct(Extra_Shot_Espresso);
        productRepo.save(Extra_Shot_Espresso);

        Product Soy_Milk = new Product ( 1, null ,"Soy Milk", null);
        productService.saveProduct(Soy_Milk);
        productRepo.save(Soy_Milk);

        Product Whole_Milk = new Product ( 1, null,"Whole Milk", null);
        productService.saveProduct(Whole_Milk);
        productRepo.save(Whole_Milk);

        Product Milk_2 = new Product ( 1, null,"2% Milk", null);
        productService.saveProduct(Milk_2);
        productRepo.save(Milk_2);
        
        Product Almond_Milk = new Product ( 1,null,"Almond Milk", null);
        productService.saveProduct(Almond_Milk);
        productRepo.save(Almond_Milk);
    }
}*/


