﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System.Collections.Generic;

namespace AutoRest.Java.Model
{
    /// <summary>
    /// Details that describe the REST API for a service.
    /// </summary>
    public class RestAPI
    {
        /// <summary>
        /// Create a new RestAPI using the provided properties.
        /// </summary>
        /// <param name="name">The name of the REST API interface.</param>
        /// <param name="baseURL">The base URL that will be used for each REST API method.</param>
        /// <param name="methods">The methods of this REST API.</param>
        public RestAPI(string name, string baseURL, IEnumerable<RestAPIMethod> methods)
        {
            Name = name;
            BaseURL = baseURL;
            Methods = methods;
        }

        /// <summary>
        /// Get the name of the REST API interface.
        /// </summary>
        public string Name { get; }

        /// <summary>
        /// Get the base URL that will be used for each REST API method.
        /// </summary>
        public string BaseURL { get; }

        /// <summary>
        /// Get the methods of this REST API.
        /// </summary>
        public IEnumerable<RestAPIMethod> Methods { get; }

        /// <summary>
        /// Add this property's imports to the provided ISet of imports.
        /// </summary>
        /// <param name="imports">The set of imports to add to.</param>
        /// <param name="includeImplementationImports">Whether or not to include imports that are only necessary for method implementations.</param>
        public void AddImportsTo(ISet<string> imports, bool includeImplementationImports, JavaSettings settings)
        {
            imports.Add("com.microsoft.rest.v2.annotations.Host");

            foreach (RestAPIMethod method in Methods)
            {
                method.AddImportsTo(imports, includeImplementationImports, settings);
            }
        }
    }
}