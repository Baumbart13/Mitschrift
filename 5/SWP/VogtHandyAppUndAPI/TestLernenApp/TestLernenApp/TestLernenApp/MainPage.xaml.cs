using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TestLernenApp.viewmodel;
using Xamarin.Forms;

namespace TestLernenApp
{
    // Learn more about making custom code visible in the Xamarin.Forms previewer
    // by visiting https://aka.ms/xamarinforms-previewer
    [DesignTimeVisible(false)]
    public partial class MainPage : ContentPage
    {
        private userViewModel uvm = new userViewModel();
        public MainPage()
        {
            
            InitializeComponent();
            this.BindingContext = uvm;
        }
    }
}
