package com.bs.user.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
int bookid;
String bookname;
String catagory;
String author;
double price;
String overview;
int availability;
Date published;
float ratings;
}
