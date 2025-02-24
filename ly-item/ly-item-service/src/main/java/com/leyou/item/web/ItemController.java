package com.leyou.item.web;

import com.leyou.enums.ExceptionEnum;
import com.leyou.exception.LyException;
import com.leyou.item.pojo.Item;
import com.leyou.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public ResponseEntity<Item> saveItem(Item item){
        if (item.getPrice()==null){
            throw new LyException(ExceptionEnum.PRICE_CANNOT_BE_NULL);
        }
        itemService.saveItem(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(item);
    }


}
