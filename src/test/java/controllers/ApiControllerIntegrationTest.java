/**
 * Copyright (C) 2013 the original author or authors.
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

package controllers;


import models.User;
import ninja.NinjaTest;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ApiControllerIntegrationTest extends NinjaTest {

    ObjectMapper objectMapper;

    @Before
    public void beforeEach() {
        objectMapper = new ObjectMapper();
    }

    @Test
    public void testGetIndex() {
        String response = ninjaTestBrowser.makeJsonRequest(getServerAddress());
        try {
            List<User> users = objectMapper.readValue(response, List.class);
            assertEquals(1, users.size());
        } catch (IOException ioe) {
            fail(ioe.getMessage());
        }
    }
}
