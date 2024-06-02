public class EnhancedFor {
    // Enhanced for loop is specially designed to use in collection/array
    int [] data = {12,15,17,19,16,15,13,11,8,5};for(
    int i = 0;i<data.length;i++)
    {
        System.out.println(data[i]);
    }
    // we can do the same work using enhanced for loop
    for(
    int e:data)
    { // for each element int e in data collection
        System.out.println(e);

    }

}
