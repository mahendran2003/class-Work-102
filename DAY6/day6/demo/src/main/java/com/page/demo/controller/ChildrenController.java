package com.page.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import com.page.demo.model.Children;
import com.page.demo.service.ChildrenService;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class ChildrenController {
    public ChildrenService childrenService;

    public ChildrenController(ChildrenService childrenService) {
        this.childrenService = childrenService;
    }

    @PostMapping("/api/children")
    public ResponseEntity<Children> posting(@RequestBody Children children)
    {
        Children obj=childrenService.posting(children);
        return new ResponseEntity<>(obj,HttpStatus.CREATED);
    }

    @GetMapping("/api/children/sortBy/{field}")
    public ResponseEntity<List<Children>> paging(@PathVariable String field)
    {
        List<Children> obj2=childrenService.sorting(field);
        return new ResponseEntity<>(obj2,HttpStatus.OK);
    }
    
    @GetMapping("api/children/{offset}/{pagesize}")
    public ResponseEntity<Page<Children>> pag(@PathVariable int offset,@PathVariable int pagesize)
    {
        Page<Children> obj3=childrenService.childpag(offset,pagesize);
        return new ResponseEntity<>(obj3,HttpStatus.OK);
    }

    @GetMapping("/api/children/{offset}/{pagesize}/{fl}")
    public ResponseEntity<Page<Children>> pg(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String fl)
    {
        Page<Children> obj3=childrenService.paging(offset,pagesize,fl);
        return new ResponseEntity<>(obj3,HttpStatus.OK);
    }

}
