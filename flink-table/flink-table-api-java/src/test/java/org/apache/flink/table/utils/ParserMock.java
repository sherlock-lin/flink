/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.table.utils;

import org.apache.flink.table.catalog.UnresolvedIdentifier;
import org.apache.flink.table.delegation.Parser;
import org.apache.flink.table.expressions.ResolvedExpression;
import org.apache.flink.table.operations.Operation;
import org.apache.flink.table.types.logical.LogicalType;
import org.apache.flink.table.types.logical.RowType;

import javax.annotation.Nullable;

import java.util.Collections;
import java.util.List;

/** Mocks {@link Parser} for tests. */
public class ParserMock implements Parser {
    @Override
    public List<Operation> parse(String statement) {
        return Collections.emptyList();
    }

    @Override
    public UnresolvedIdentifier parseIdentifier(String identifier) {
        return UnresolvedIdentifier.of(identifier);
    }

    @Override
    public ResolvedExpression parseSqlExpression(
            String sqlExpression, RowType inputRowType, @Nullable LogicalType outputType) {
        return null;
    }

    @Override
    public String[] getCompletionHints(String statement, int position) {
        throw new UnsupportedOperationException("Unsupported operation.");
    }
}
