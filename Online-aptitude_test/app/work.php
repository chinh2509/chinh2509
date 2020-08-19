<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class work extends Model
{
    //use Notifiable;
    /**
     * The attributes that are mass assignable.
     *
     * @var array
     */

    public $timestamps = false;
    
    protected $fillable = [
        'salary', 'title', 'address','form','career','description',
    ];
}
