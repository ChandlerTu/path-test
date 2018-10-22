#!/bin/sh

PRGDIR=`dirname $0`

java -cp $PRGDIR/lib/* com.chandlertu.path.test.PathTest &
