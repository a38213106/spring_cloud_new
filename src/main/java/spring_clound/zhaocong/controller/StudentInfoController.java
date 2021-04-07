/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package spring_clound.zhaocong.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring_clound.zhaocong.model.StudentInfo;
import spring_clound.zhaocong.service.StudentInfoService;




/**
 * @author liuzh
 * @since 2015-12-19 11:10
 */
@RestController
@RequestMapping(value = "${version}/student")
@Api(value="StudentInfoController",description = "StudentInfoController",produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentInfoController {

    @Autowired
    private StudentInfoService studentInfoService;

    @GetMapping(value = "/{studentNo}")
    @ApiOperation(value = "通过学籍号查询学生基本能信息",httpMethod = "GET",produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParam(name = "studentNo",value = "学籍号",dataType = "String",required = true,paramType = "path")
    public StudentInfo getStudentById(@PathVariable String studentNo) {
        return studentInfoService.getStudentById(studentNo);
    }

}
