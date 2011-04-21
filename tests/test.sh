#!/bin/bash

positive=`ls tests/positive/*.java` 
for fname in $positive
do
    java -jar dist/mjc.jar $fname
    name=`basename ${fname%\.*}`
    output="${fname%\.*}.output"
    cd $name
    java $name > output
    if `cmp -s output ../${output} > /dev/null`; then
        echo "OK"
    else
        echo "FAIL"
        exit 1
    fi
    cd ..
    rm -r "$name"
done