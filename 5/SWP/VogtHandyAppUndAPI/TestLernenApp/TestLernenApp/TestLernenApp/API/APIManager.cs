using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using TestLernenApp.model;

namespace TestLernenApp.API
{
    class APIManager
    {
        private static HttpClient _client = new HttpClient();
        public static async Task<ObservableCollection<User>> getUsers()
        {
            HttpResponseMessage response = await _client.GetAsync("http://localhost:4000/api/User/get");
            if (response.IsSuccessStatusCode)
            {
                string responseJson = await response.Content.ReadAsStringAsync();
                return JsonConvert.DeserializeObject<ObservableCollection<User>>(responseJson);
            }
            return null;
        }

        public static async Task<User> getUserById(string id)
        {
            HttpResponseMessage response = await _client.GetAsync("http://localhost:4000/api/User/get/" + id);
            if (response.IsSuccessStatusCode)
            {
                string responseJson = await response.Content.ReadAsStringAsync();
                return JsonConvert.DeserializeObject<User>(responseJson);
            }
            return null;
        }

        public static async Task<bool> postUserToAPI(User u)
        {
            var json = JsonConvert.SerializeObject(u);
            var data = new StringContent(json, Encoding.UTF8, "application/json");

            var url = "http://localhost:4000/api/User/post";
            var response = await _client.PostAsync(url, data);
            return response.IsSuccessStatusCode;
        }

    }
}
