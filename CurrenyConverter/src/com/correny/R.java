package com.correny;

import java.io.*;
import java.net.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.InputStream;
import java.net.*;
import com.google.gson.*;

/**
 *
 * @author pakallis
 */
class Recv
{
private String lhs;
private String rhs;
private String error;
private String icc;
public Recv()
{
}
public String getLhs()
{
return lhs;
}
public String getRhs()
{
return rhs;
}
}