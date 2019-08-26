package com.ex.groceries.Web;

import com.ex.groceries.Services.GroceryListItemsService;
import com.ex.groceries.Services.GroceryListService;
import com.ex.groceries.models.groceryList;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("GroceryList")
public class GroceryListControler implements ApplicationContextAware {
    private ApplicationContext context;
    private GroceryListService GListService;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @GetMapping(path="posting", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getGroceryLists (){

        List<groceryList> gList = GListService.getAll();
        return new ResponseEntity<>(gList, HttpStatus.OK);
    }

}

