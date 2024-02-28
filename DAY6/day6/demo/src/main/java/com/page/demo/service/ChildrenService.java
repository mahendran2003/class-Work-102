package com.page.demo.service;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.page.demo.model.Children;
import com.page.demo.repository.ChildrenRepo;

@Service
public class ChildrenService {
    public ChildrenRepo childrenRepo;

    public ChildrenService(ChildrenRepo childrenRepo) {
        this.childrenRepo = childrenRepo;
    }
    

    public Children posting(Children children)
    {
        return childrenRepo.save(children);
    }

    public Page<Children> childpag(int offset,int pagesize)
    {
        return childrenRepo.findAll(PageRequest.of(offset, pagesize));
    }

    public Page<Children> paging(int offset,int pagesize,String field)
    {
        return childrenRepo.findAll(PageRequest.of(offset, pagesize, Sort.Direction.ASC, field));
    }

    public List<Children> sorting(String fi)
    {
        return childrenRepo.findAll( Sort.by(Sort.Direction.ASC,fi) );
    }
}
