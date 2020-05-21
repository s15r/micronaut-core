/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.scheduling.instrument;

import edu.umd.cs.findbugs.annotations.NonNull;

/**
 * This implementation does no instrumentation.
 *
 * @author lgathy
 * @since 2.0
 */
enum NoopInstrumentation implements Instrumentation {

    INSTANCE;

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public void close(boolean cleanup) {
        // nothing to do
    }

    @Override
    public void close() {
        // nothing to do
    }

    @Override
    public @NonNull Instrumentation forceCleanup() {
        return this;
    }
}
