/*
 * Copyright 2016 Copyright 2016 Víctor Albertos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package rx_activity_result2;

import android.content.Intent;
import androidx.annotation.Nullable;

class Request {
    private final Intent intent;
    private int requestCode = 0;
    private OnPreResult onPreResult;
    private OnResult onResult;

    public Request(@Nullable Intent intent) {
        this.intent = intent;
    }

    public Request(@Nullable Intent intent, int requestCode ) {
        this.intent = intent;
        this.requestCode = requestCode;
    }

    void setOnPreResult(@Nullable OnPreResult onPreResult) {
        this.onPreResult = onPreResult;
    }

    OnPreResult onPreResult() {
        return onPreResult;
    }

    public void setOnResult(OnResult onResult) {
        this.onResult = onResult;
    }

    public OnResult onResult() {
        return onResult;
    }

    @Nullable public Intent intent() {
        return intent;
    }

    public void setRequestCode(int requestCode) { this.requestCode = requestCode; }

    public int getRequestCode() { return requestCode; }
}
