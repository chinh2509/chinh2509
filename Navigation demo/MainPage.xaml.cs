using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices.WindowsRuntime;
using Windows.Foundation;
using Windows.Foundation.Collections;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Controls.Primitives;
using Windows.UI.Xaml.Data;
using Windows.UI.Xaml.Input;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Navigation;

// The Blank Page item template is documented at https://go.microsoft.com/fwlink/?LinkId=402352&clcid=0x409

namespace Navigation_demo
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class MainPage : Page
    {

        public MainPage()
        {
            this.InitializeComponent();
            MyFrame.Navigate(typeof(BlankPage1));
        }

        private void trang1_Click(object sender, RoutedEventArgs e)
        {
            MyFrame.Navigate(typeof(BlankPage1));
        }

        private void trang2_Click(object sender, RoutedEventArgs e)
        {
            MyFrame.Navigate(typeof(BlankPage2));
        }

        private void trang3_Click(object sender, RoutedEventArgs e)
        {
            MyFrame.Navigate(typeof(BlankPage3));
        }

        private void NavigateButton_Click(object sender, RoutedEventArgs e)
        {
            MyFrame.Navigate(typeof(BlankPage3));
        }

        private void back_Click(object sender, RoutedEventArgs e)
        {
            if (MyFrame.CanGoBack)
            {
                MyFrame.GoBack();
            }
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            if (MyFrame.CanGoForward)
            {
                MyFrame.GoForward();
            }
        }
    }
}
