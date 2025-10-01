package com.javatpoint.base;

import java.sql.*;
import org.springframework.context.annotation.Configuration;

public interface IDatabase {
   public Connection getConnection();
}

