package com.bs.vendor.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
@Id
int bookid;
String bookname;
String catagory;
String author;
double price;
String overview;
int availability;
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
Date published;
float ratings;
}
