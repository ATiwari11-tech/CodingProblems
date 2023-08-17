package com.LLD.factory.version3;

import com.LLD.factory.version2.Query;

public interface Database {
  DatabaseFactory createDatabaseFactory();//for client it's removing the need of writing if/else
}
